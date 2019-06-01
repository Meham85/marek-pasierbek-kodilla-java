package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;



import java.util.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class StatisticsTestSuite {
    @Test
    public void calculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        StaticticsCollector staticticsCollector = new StaticticsCollector(statisticsMock); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        staticticsCollector.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(5, usersCount);
    }
}