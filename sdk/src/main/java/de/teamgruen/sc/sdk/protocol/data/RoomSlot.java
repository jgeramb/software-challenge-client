/*
 * Copyright (c) 2024 Justus Geramb (https://www.justix.dev)
 * All Rights Reserved.
 */

package de.teamgruen.sc.sdk.protocol.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record RoomSlot(@JacksonXmlProperty(isAttribute = true)
                       String displayName,
                       @JacksonXmlProperty(isAttribute = true)
                       boolean canTimeout,
                       @JacksonXmlProperty(isAttribute = true)
                       boolean reserved) {
}
