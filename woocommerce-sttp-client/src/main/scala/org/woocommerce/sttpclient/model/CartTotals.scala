/**
 * wc/store
 * OpenAPI document of the namespace wc/store. Based on generated json document, with some changes and additions
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.sttpclient.model


  /**
   * Total amounts provided using the smallest unit of the currency.
   */
case class CartTotals(
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
  currencySuffix: Option[String] = None,
  /* Total discount applied by this coupon. */
  totalDiscount: Option[String] = None,
  /* Total tax removed due to discount applied by this coupon. */
  totalDiscountTax: Option[String] = None
)

