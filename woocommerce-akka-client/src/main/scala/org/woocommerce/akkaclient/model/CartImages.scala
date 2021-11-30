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

import java.net.URI
import org.woocommerce.akkaclient.core.ApiModel

case class CartImages (
  /* Image ID. */
  id: Option[Int] = None,
  /* Full size image URL. */
  src: Option[URI] = None,
  /* Thumbnail URL. */
  thumbnail: Option[URI] = None,
  /* Thumbnail srcset for responsive images. */
  srcset: Option[String] = None,
  /* Thumbnail sizes for responsive images. */
  sizes: Option[String] = None,
  /* Image name. */
  name: Option[String] = None,
  /* Image alternative text. */
  alt: Option[String] = None
) extends ApiModel

