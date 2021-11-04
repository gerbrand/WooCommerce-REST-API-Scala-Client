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

case class CartCoupons (
  /* The coupon's unique code. */
  code: Option[String] = None,
  /* The discount type for the coupon (e.g. percentage or fixed amount) */
  discountType: Option[String] = None,
  totals: Option[CartTotals] = None
) extends ApiModel

