/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodynumber.models.ErrorException;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * An instance of this class provides access to all the operations defined
 * in NumberOperations.
 */
public interface NumberOperations {
    /**
     * Get null Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getNull() throws ErrorException, IOException;

    /**
     * Get null Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getNullAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Get invalid float Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidFloat() throws ErrorException, IOException;

    /**
     * Get invalid float Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Get invalid double Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidDouble() throws ErrorException, IOException;

    /**
     * Get invalid double Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Get invalid decimal Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getInvalidDecimal() throws ErrorException, IOException;

    /**
     * Get invalid decimal Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInvalidDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigFloat() throws ErrorException, IOException;

    /**
     * Get big float value 3.402823e+20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigFloatAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDoubleAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoublePositiveDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big double value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoublePositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big double value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoubleNegativeDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big double value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoubleNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big double value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalPositiveDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDecimalPositiveDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalPositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDecimalPositiveDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback) throws IllegalArgumentException;

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalNegativeDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBigDecimalNegativeDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBigDecimalNegativeDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback) throws IllegalArgumentException;

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallFloat() throws ErrorException, IOException;

    /**
     * Get big double value 3.402823e-20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSmallFloatAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback) throws IllegalArgumentException;

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putSmallDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getSmallDecimal() throws ErrorException, IOException;

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSmallDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback) throws IllegalArgumentException;

}
