/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.teller.service.internal.repository;

import io.mifos.core.mariadb.util.LocalDateTimeConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tajet_teller")
public class TellerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "identifier", nullable = false, length = 32)
  private String identifier;
  @Column(name = "a_password", nullable = false, length = 4096)
  private String password;
  @Column(name = "a_salt", nullable = false, length = 4096)
  private String salt;
  @Column(name = "office_identifier", nullable = false, length = 32)
  private String officeIdentifier;
  @Column(name = "cashdraw_limit", nullable = false)
  private Double cashdrawLimit;
  @Column(name = "teller_account_identifier", nullable = false, length = 32)
  private String tellerAccountIdentifier;
  @Column(name = "vault_account_identifier", nullable = false, length = 32)
  private String vaultAccountIdentifier;
  @Column(name = "assigned_employee_identifier", nullable = true, length = 32)
  private String assignedEmployeeIdentifier;
  @Column(name = "a_state", nullable = false, length = 256)
  private String state;
  @Column(name = "created_by", nullable = false, length = 32)
  private String createdBy;
  @Column(name = "created_on", nullable = false)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime createdOn;
  @Column(name = "last_modified_by", nullable = true, length = 32)
  private String lastModifiedBy;
  @Column(name = "last_modified_on", nullable = true)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime lastModifiedOn;

  public TellerEntity() {
    super();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(final String identifier) {
    this.identifier = identifier;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(final String salt) {
    this.salt = salt;
  }

  public String getOfficeIdentifier() {
    return this.officeIdentifier;
  }

  public void setOfficeIdentifier(final String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
  }

  public Double getCashdrawLimit() {
    return this.cashdrawLimit;
  }

  public void setCashdrawLimit(final Double cashdrawLimit) {
    this.cashdrawLimit = cashdrawLimit;
  }

  public String getTellerAccountIdentifier() {
    return this.tellerAccountIdentifier;
  }

  public void setTellerAccountIdentifier(final String tellerAccountIdentifier) {
    this.tellerAccountIdentifier = tellerAccountIdentifier;
  }

  public String getVaultAccountIdentifier() {
    return this.vaultAccountIdentifier;
  }

  public void setVaultAccountIdentifier(final String vaultAccountIdentifier) {
    this.vaultAccountIdentifier = vaultAccountIdentifier;
  }

  public String getAssignedEmployeeIdentifier() {
    return this.assignedEmployeeIdentifier;
  }

  public void setAssignedEmployeeIdentifier(final String assignedEmployeeIdentifier) {
    this.assignedEmployeeIdentifier = assignedEmployeeIdentifier;
  }

  public String getState() {
    return this.state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public String getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(final String createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getCreatedOn() {
    return this.createdOn;
  }

  public void setCreatedOn(final LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public String getLastModifiedBy() {
    return this.lastModifiedBy;
  }

  public void setLastModifiedBy(final String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public LocalDateTime getLastModifiedOn() {
    return this.lastModifiedOn;
  }

  public void setLastModifiedOn(final LocalDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }
}
