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

case class ShippingAddress2 (
  /* First name */
  firstName: String,
  /* Last name */
  lastName: String,
  /* Company */
  company: String,
  /* Address */
  address1: String,
  /* Apartment, suite, etc. */
  address2: String,
  /* City */
  city: String,
  /* State/County code, or name of the state, county, province, or district. */
  state: String,
  /* Postal code */
  postcode: String,
  /* Country/Region code in ISO 3166-1 alpha-2 format. */
  country: String,
  /* Phone */
  phone: String
) extends ApiModel

