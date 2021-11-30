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

case class ProductTags (
  /* Tag ID */
  id: Option[BigDecimal] = None,
  /* Tag name */
  name: Option[String] = None,
  /* Tag slug */
  slug: Option[String] = None,
  /* Tag link */
  link: Option[String] = None
) extends ApiModel

