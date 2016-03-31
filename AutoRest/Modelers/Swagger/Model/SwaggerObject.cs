// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Globalization;
using Newtonsoft.Json;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Modeler.Swagger.Properties;
using Microsoft.Rest.Generator.Logging;

namespace Microsoft.Rest.Modeler.Swagger.Model
{
    /// <summary>
    /// Describes a single operation determining with this object is mandatory.
    /// https://github.com/wordnik/swagger-spec/blob/master/versions/2.0.md#parameterObject
    /// </summary>
    [Serializable]
    public abstract class SwaggerObject : SwaggerBase
    {
        public virtual bool IsRequired { get; set; }

        /// <summary>
        /// The type of the parameter.
        /// </summary>
        public virtual DataType? Type { get; set; }

        /// <summary>
        /// The extending format for the previously mentioned type.
        /// </summary>
        public virtual string Format { get; set; }

        /// <summary>
        /// Describes the type of items in the array.
        /// </summary>
        public virtual Schema Items { get; set; }

        [JsonProperty(PropertyName = "$ref")]
        public string Reference { get; set; }

        /// <summary>
        /// Describes the type of additional properties in the data type.
        /// </summary>
        public virtual Schema AdditionalProperties { get; set; }

        public virtual string Description { get; set; }

        /// <summary>
        /// Determines the format of the array if type array is used.
        /// </summary>
        public virtual CollectionFormat CollectionFormat { get; set; }

        /// <summary>
        /// Sets a default value to the parameter.
        /// </summary>
        public virtual string Default { get; set; }

        public virtual string MultipleOf { get; set; }

        public virtual string Maximum { get; set; }

        public virtual bool ExclusiveMaximum { get; set; }

        public virtual string Minimum { get; set; }

        public virtual bool ExclusiveMinimum { get; set; }

        public virtual string MaxLength { get; set; }

        public virtual string MinLength { get; set; }

        public virtual string Pattern { get; set; }

        public virtual string MaxItems { get; set; }

        public virtual string MinItems { get; set; }

        public virtual bool UniqueItems { get; set; }

        public virtual IList<string> Enum { get; set; }

        public ObjectBuilder GetBuilder(SwaggerModeler swaggerSpecBuilder)
        {
            if (this is SwaggerParameter)
            {
                return new ParameterBuilder(this as SwaggerParameter, swaggerSpecBuilder);
            }
            if (this is Schema)
            {
                return new SchemaBuilder(this as Schema, swaggerSpecBuilder);
            }
            return new ObjectBuilder(this, swaggerSpecBuilder);
        }

        public PrimaryType ToType()
        {
            switch (Type)
            {
                case DataType.String:
                    if (string.Equals("date", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.Date);
                    }
                    if (string.Equals("date-time", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.DateTime);
                    }
                    if (string.Equals("date-time-rfc1123", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.DateTimeRfc1123);
                    }
                    if (string.Equals("byte", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.ByteArray);
                    }
                    if (string.Equals("duration", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.TimeSpan);
                    }
                    if (string.Equals("uuid", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.Uuid);
                    }
                    if (string.Equals("base64url", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.Base64Url);
                    }
                    return new PrimaryType(KnownPrimaryType.String);
                case DataType.Number:
                    if (string.Equals("decimal", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.Decimal);
                    }
                    return new PrimaryType(KnownPrimaryType.Double);
                case DataType.Integer:
                    if (string.Equals("int64", Format, StringComparison.OrdinalIgnoreCase))
                    {
                        return new PrimaryType(KnownPrimaryType.Long);
                    }
                    return new PrimaryType(KnownPrimaryType.Int);
                case DataType.Boolean:
                    return new PrimaryType(KnownPrimaryType.Boolean);
                case DataType.Object:
                case DataType.Array:
                case null:
                    return new PrimaryType(KnownPrimaryType.Object);
                case DataType.File:
                    return new PrimaryType(KnownPrimaryType.Stream);
                default:
                    throw new NotImplementedException(
                        string.Format(CultureInfo.InvariantCulture, 
                           Resources.InvalidTypeInSwaggerSchema,
                            Type));
            }
        }

        public override bool Compare(SwaggerBase priorVersion, ValidationContext context)
        {
            var prior = priorVersion as SwaggerObject;

            if (prior == null)
            {
                throw new ArgumentNullException("priorVersion");
            }

            var errorCount = context.ValidationErrors.Count;

            base.Compare(priorVersion, context);

            if (Reference != null && !Reference.Equals(prior.Reference))
            {
                context.LogBreakingChange("The '$ref' property points to different models in the old and new versions");
            }

            if (IsRequired != prior.IsRequired)
            {
                context.LogBreakingChange("The 'required' status changed from the old version to the new");
            }
            
            // Are the types the same?

            if (prior.Type.HasValue != Type.HasValue || (Type.HasValue && prior.Type.Value != Type.Value))
            {
                context.LogBreakingChange("The new version has a different type than the previous one");
            }

            // What about the formats?

            CompareFormats(prior, context);

            CompareItems(prior, context);

            if (Default != null && !Default.Equals(prior.Default) || (Default == null && !string.IsNullOrEmpty(prior.Default)))
            {
                context.LogBreakingChange("The new version has a different default value than the previous one");
            }
            return context.ValidationErrors.Count == errorCount;
        }

        protected void CompareFormats(SwaggerObject prior, ValidationContext context)
        {
            if (prior.Format == null && Format != null || prior.Format != null && Format == null)
            {
                context.LogBreakingChange("The new version has a different format than the previous one");
            }
        }
        
        protected void CompareItems(SwaggerObject prior, ValidationContext context)
        {
            if (prior.Items != null && Items != null)
            {
                context.PushTitle(context.Title + "/items");
                Items.Compare(prior.Items, context);
                context.PopTitle();
            }
        }
    }
}