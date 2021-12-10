/**
 * wc/v3
 * OpenAPI documented, based on generated OpenAPI document of the namespace wc/v3 with some manual fixes.
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

case class ShopCoupon4 (
  /* Coupon code. */
  code: Option[String] = None,
  /* The amount of discount. Should always be numeric, even if setting a percentage. */
  amount: Option[String] = None,
  /* Determines the type of discount that will be applied. */
  discountType: Option[ShopCoupon4Enums.DiscountType] = None,
  /* Coupon description. */
  description: Option[String] = None,
  /* The date the coupon expires, in the site's timezone. */
  dateExpires: Option[String] = None,
  /* The date the coupon expires, as GMT. */
  dateExpiresGmt: Option[String] = None,
  /* If true, the coupon can only be used individually. Other applied coupons will be removed from the cart. */
  individualUse: Option[Boolean] = None,
  /* List of product IDs the coupon can be used on. */
  productIds: Option[Seq[Int]] = None,
  /* List of product IDs the coupon cannot be used on. */
  excludedProductIds: Option[Seq[Int]] = None,
  /* How many times the coupon can be used in total. */
  usageLimit: Option[Int] = None,
  /* How many times the coupon can be used per customer. */
  usageLimitPerUser: Option[Int] = None,
  /* Max number of items in the cart the coupon can be applied to. */
  limitUsageToXItems: Option[Int] = None,
  /* If true and if the free shipping method requires a coupon, this coupon will enable free shipping. */
  freeShipping: Option[Boolean] = None,
  /* List of category IDs the coupon applies to. */
  productCategories: Option[Seq[Int]] = None,
  /* List of category IDs the coupon does not apply to. */
  excludedProductCategories: Option[Seq[Int]] = None,
  /* If true, this coupon will not be applied to items that have sale prices. */
  excludeSaleItems: Option[Boolean] = None,
  /* Minimum order amount that needs to be in the cart before coupon applies. */
  minimumAmount: Option[String] = None,
  /* Maximum order amount allowed when using the coupon. */
  maximumAmount: Option[String] = None,
  /* List of email addresses that can use this coupon. */
  emailRestrictions: Option[Seq[String]] = None,
  /* Meta data. */
  metaData: Option[Seq[CouponsMetaData]] = None
) extends ApiModel

object ShopCoupon4Enums {

  type DiscountType = DiscountType.Value
  object DiscountType extends Enumeration {
    val Percent = Value("percent")
    val FixedCart = Value("fixed_cart")
    val FixedProduct = Value("fixed_product")
  }

}
