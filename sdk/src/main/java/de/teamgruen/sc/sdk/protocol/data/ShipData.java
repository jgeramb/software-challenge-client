/*
 * Copyright (c) 2024 Justus Geramb (https://www.justix.dev)
 * All Rights Reserved.
 */

package de.teamgruen.sc.sdk.protocol.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "ship")
public class ShipData {

    @JacksonXmlProperty(isAttribute = true)
    private Team team;
    @JacksonXmlProperty(isAttribute = true)
    private Direction direction;
    @JacksonXmlProperty(isAttribute = true)
    private int speed, coal, passengers, freeTurns, points;
    @JacksonXmlProperty(isAttribute = true)
    private boolean stuck;
    private Position position;

}
