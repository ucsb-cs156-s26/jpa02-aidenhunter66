package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team otherteam;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
        otherteam = new Team("other-team")
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
        assertSame(team,team);
        assertNotSame(otherteam,team);
    }

    // @Test
    // public void different_object(){
    //     assertEquals(team,otherteam);
    // }


}
