/**
 * Copyright (c) Codice Foundation
 * <p>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 **/

package org.codice.ddf.security.certificate.generator;

/**
 * Custome exception class for the certificate generator package. Strategy is to wrap sundry
 * errors generated by the Java and Bouncy Castle cryptography/PKIX/JCA provider
 * classes and present unified exception to client code.
 */

public class CertificateGeneratorException extends RuntimeException {

    public CertificateGeneratorException(String msg) {
        super(msg);
    }

    public CertificateGeneratorException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
