/*******************************************************************************
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 01/01/2017
 * Author: Huyen Lam <email:huyen.lam@mediastep.com>
 *  
 *******************************************************************************/
package com.mediastep.beecow.common.security;

/**
 * Token DTO.
 */
public interface Token {

    String getAccessToken();

    String getRefreshToken();
}
