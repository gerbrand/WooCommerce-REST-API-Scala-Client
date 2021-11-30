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

import java.net.URI

case class Product(
  /* Unique identifier for the resource. */
  id: Option[Int] = None,
  /* Product name. */
  name: Option[String] = None,
  /* ID of the parent product, if applicable. */
  parent: Option[Int] = None,
  /* Product type. */
  `type`: Option[String] = None,
  /* Product variation attributes, if applicable. */
  variation: Option[String] = None,
  /* Product URL. */
  permalink: Option[URI] = None,
  /* Product short description in HTML format. */
  shortDescription: Option[String] = None,
  /* Product full description in HTML format. */
  description: Option[String] = None,
  /* Is the product on sale? */
  onSale: Option[Boolean] = None,
  /* Unique identifier. */
  sku: Option[String] = None,
  prices: Option[ProductPrices] = None,
  /* Price string formatted as HTML. */
  priceHtml: Option[String] = None,
  /* Reviews average rating. */
  averageRating: Option[String] = None,
  /* Amount of reviews that the product has. */
  reviewCount: Option[Int] = None,
  /* List of images. */
  images: Option[Seq[CartImages]] = None,
  /* List of categories, if applicable. */
  categories: Option[Seq[ProductCategories]] = None,
  /* List of tags, if applicable. */
  tags: Option[Seq[ProductTags]] = None,
  /* List of attributes assigned to the product/variation that are visible or used for variations. */
  attributes: Option[Seq[ProductAttributes]] = None,
  /* List of variation IDs, if applicable. */
  variations: Option[Seq[ProductVariations]] = None,
  /* Does the product have additional options before it can be added to the cart? */
  hasOptions: Option[Boolean] = None,
  /* Is the product purchasable? */
  isPurchasable: Option[Boolean] = None,
  /* Is the product in stock? */
  isInStock: Option[Boolean] = None,
  /* Is the product stock backordered? This will also return false if backorder notifications are turned off. */
  isOnBackorder: Option[Boolean] = None,
  /* Quantity left in stock if stock is low, or null if not applicable. */
  lowStockRemaining: Option[Int] = None,
  /* If true, only one item of this product is allowed for purchase in a single order. */
  soldIndividually: Option[Boolean] = None,
  /* The maximum quantity than can be added to the cart at once. */
  quantityLimit: Option[Int] = None,
  addToCart: Option[ProductAddToCart] = None
)

