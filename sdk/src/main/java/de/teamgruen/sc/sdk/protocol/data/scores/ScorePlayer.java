package de.teamgruen.sc.sdk.protocol.data.scores;

import de.teamgruen.sc.sdk.protocol.data.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScorePlayer {

    private String name;
    private Team team;

}
