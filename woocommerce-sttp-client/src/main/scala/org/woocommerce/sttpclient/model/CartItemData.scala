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


case class CartItemData(
  /* Name of the metadata. */
  name: Option[String] = None,
  /* Value of the metadata. */
  value: Option[String] = None,
  /* Optionally, how the metadata value should be displayed to the user. */
  display: Option[String] = None
)

