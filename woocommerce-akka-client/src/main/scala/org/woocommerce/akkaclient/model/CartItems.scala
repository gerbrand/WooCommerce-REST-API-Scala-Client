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
package org.woocommerce.akkaclient.model

import org.woocommerce.akkaclient.core.ApiModel

case class CartItems (
  /* Unique identifier for the item within the cart. */
  key: Option[String] = None,
  /* Name of the item. */
  name: Option[String] = None,
  /* Quantity of the item in the current package. */
  quantity: Option[BigDecimal] = None
) extends ApiModel

