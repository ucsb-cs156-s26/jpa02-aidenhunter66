package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team otherteam;
    Team team1;
    Team team2;
    Team team3;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
        otherteam = new Team("other-team");
        team1 = new Team("test-team");
        team2 = new Team("team-two");
        team3 = new Team("team-three");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void same_object(){
        assertEquals(true,team.equals(team));
        assertEquals(false,team.equals(otherteam));
    }

    @Test
    public void instance_of_team(){
        int dummy = 0;
        assertEquals(false, team.equals(dummy));
    }

    @Test
    public void comparison_of_teams(){

    assertEquals(true, team.equals(team1)); 

    team1.addMember("Robert");
    assertEquals(false, team.equals(team1)); 

    assertEquals(false, team.equals(team2)); 

    assertEquals(false, team.equals(team3)); 
    }

    @Test
    public void hash_test(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult,result);
    }

}
