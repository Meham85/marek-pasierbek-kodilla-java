package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;



import java.util.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class StatisticsTestSuite {
    @Test
    public void calculateAdvStatisticsFirstTEst() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(4);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount());
        Assert.assertEquals(4, statCollector.getPostCount());
        Assert.assertEquals(2, statCollector.getComentsCount());

    }
    @Test
    public void calculateAdvStatisticsPost1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(1000, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(20, statCollector.getComentsCount()); /*spodziewane komentarze */
        Assert.assertEquals(6.66, statCollector.getAvgCommentsPerUser(), 0.1); /*spodziewane komentarze na usera */
        Assert.assertEquals(333.33, statCollector.getAvgPostsPerUser(), 0.1); /*spodziewane posty na usera */
        Assert.assertEquals(0.02, statCollector.getComentsVsposts(), 0.01); /*spodziewane komentarze na post */
    }
    @Test
    public void calculateAdvStatisticsPost0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(0, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(20, statCollector.getComentsCount()); /*spodziewane komentarze */
        Assert.assertEquals(6.66,statCollector.getAvgCommentsPerUser(), 0.1); /*spodziewane komentarze na usera */
        Assert.assertEquals(0.0, statCollector.getAvgPostsPerUser(), 0.001); /*spodziewane posty na usera */
        Assert.assertEquals(0.0, statCollector.getComentsVsposts(), 0.0001); /*spodziewane komentarze na post */
    }

    @Test
    public void calculateAdvStatisticsComents0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(3);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(3, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(0, statCollector.getComentsCount()); /*spodziewane komentarze */
        Assert.assertEquals(0.0, statCollector.getAvgCommentsPerUser(), 0.01); /*spodziewane komentarze na usera */
        Assert.assertEquals(1.0, statCollector.getAvgPostsPerUser(), 0.01); /*spodziewane posty na usera */
        Assert.assertEquals(0.0, statCollector.getComentsVsposts(), 0.01); /*spodziewane komentarze na post */
    }
    @Test
    public void calculateAdvStatisticsComentsLessPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(100, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(50, statCollector.getComentsCount(), 0.1); /*spodziewane komentarze */
        Assert.assertEquals(16.66, statCollector.getAvgCommentsPerUser(), 0.1); /*spodziewane komentarze na usera */
        Assert.assertEquals(33.33, statCollector.getAvgPostsPerUser(), 0.1); /*spodziewane posty na usera */
        Assert.assertEquals(0.5, statCollector.getComentsVsposts() ,0.1); /*spodziewane komentarze na post */
    }
    @Test
    public void calculateAdvStatisticsPostsLessComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */
        userNamesStub.add("Wojetek");
        userNamesStub.add("Magda");
        userNamesStub.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(3, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(50, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(100, statCollector.getComentsCount(), 0.1); /*spodziewane komentarze */
        Assert.assertEquals(33.33, statCollector.getAvgCommentsPerUser(), 0.1); /*spodziewane komentarze na usera */
        Assert.assertEquals(16.66, statCollector.getAvgPostsPerUser(), 0.1); /*spodziewane posty na usera */
        Assert.assertEquals(2.0, statCollector.getComentsVsposts() ,0.0001); /*spodziewane komentarze na post */
    }

    @Test
    public void calculateAdvStatisticsUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class); /*obiekt klasy implementujacej interface Statistick */
        List<String> userNamesStub = new ArrayList<String>(); /* tworze arrayliste niby przechowujaca imiona */


        when(statisticsMock.usersNames()).thenReturn(userNamesStub);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(10);
        StatCollector statCollector = new StatCollector(); /*obiekt klasy Collector, ktory przyjal obiekt interfacu Statisick po mockowaniu */
        statCollector.calculateAdvStatistics(statisticsMock);
        statCollector.showStatistics();

        Assert.assertEquals(0, statCollector.getUsersCount()); /* spoziewani userzy */
        Assert.assertEquals(10, statCollector.getPostCount()); /* spodziewane posty */
        Assert.assertEquals(10, statCollector.getComentsCount(), 0.1); /*spodziewane komentarze */
        Assert.assertEquals(0.0, statCollector.getAvgCommentsPerUser(), 0.1); /*spodziewane komentarze na usera */
        Assert.assertEquals(0.0, statCollector.getAvgPostsPerUser(), 0.1); /*spodziewane posty na usera */
        Assert.assertEquals(0.0, statCollector.getComentsVsposts() ,0.0001); /*spodziewane komentarze na post */
    }
}