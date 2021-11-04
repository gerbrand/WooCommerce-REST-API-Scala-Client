/**
 * wc/store
 * Generated OpenAPI document of the namespace wc/store on Software-Creation.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.akkaclient.model

import org.woocommerce.akkaclient.core.ApiModel

case class CartShippingRates (
  /* ID of the shipping rate. */
  rateId: Option[String] = None,
  /* Name of the shipping rate, e.g. Express shipping. */
  name: Option[String] = None,
  /* Description of the shipping rate, e.g. Dispatched via USPS. */
  description: Option[String] = None,
  /* Delivery time estimate text, e.g. 3-5 business days. */
  deliveryTime: Option[String] = None,
  /* Price of this shipping rate using the smallest unit of the currency. */
  price: Option[String] = None,
  /* Taxes applied to this shipping rate using the smallest unit of the currency. */
  taxes: Option[String] = None,
  /* ID of the shipping method that provided the rate. */
  methodId: Option[String] = None,
  /* Instance ID of the shipping method that provided the rate. */
  instanceId: Option[Int] = None,
  /* Meta data attached to the shipping rate. */
  metaData: Option[Seq[CartMetaData]] = None,
  /* True if this is the rate currently selected by the customer for the cart. */
  selected: Option[Boolean] = None,
  /* Currency code (in ISO format) for returned prices. */
  currencyCode: Option[String] = None,
  /* Currency symbol for the currency which can be used to format returned prices. */
  currencySymbol: Option[String] = None,
  /* Currency minor unit (number of digits after the decimal separator) for returned prices. */
  currencyMinorUnit: Option[Int] = None,
  /* Decimal separator for the currency which can be used to format returned prices. */
  currencyDecimalSeparator: Option[String] = None,
  /* Thousand separator for the currency which can be used to format returned prices. */
  currencyThousandSeparator: Option[String] = None,
  /* Price prefix for the currency which can be used to format returned prices. */
  currencyPrefix: Option[String] = None,
  /* Price prefix for the currency which can be used to format returned prices. */
  currencySuffix: Option[String] = None
) extends ApiModel

