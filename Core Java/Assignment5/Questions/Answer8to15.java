package co.harsh.Assignment5.Questions;

import co.harsh.Assignment5.Model.Trader;
import co.harsh.Assignment5.Model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Answer8to15 {
    public static void main(String[] args) {
        Trader t1 = new Trader("Bob","New York");

        Trader t2 = new Trader("Harmonie","London");
        Trader t3 = new Trader("Manish","Noida");
        Trader t4 = new Trader("Merry","Pune");
        Trader t5 = new Trader("Harley","New York");
        Trader t6 = new Trader("Ansh","Pune");
        Trader t7 = new Trader("Charanpreet","Pune");
        Trader t8 = new Trader("Zoe","Delhi");
        Trader t9 = new Trader("Aayansh","Delhi");
        Trader t10 = new Trader("Mihir","Delhi");


        List<Trader> traderList = Arrays.asList(t1,t2,t3,t4,t5,t6,t7);

        List<Transaction> transactionsList = Arrays.asList(new Transaction(t1,2011,200),
                new Transaction(t2,2011,3000),
                new Transaction(t3,2011,2500),
                new Transaction(t3,2011,4000),
                new Transaction(t1,2015,5000),
                new Transaction(t2,2016,3000),
                new Transaction(t3,2017,60000),
                new Transaction(t1,2015,7000),
                new Transaction(t8,2016,12000),
                new Transaction(t9,2017,8000),
                new Transaction(t10,2019,10000));

        System.out.println("Answer 8\nAll Transactions in year 2011 sorted by small values");
        transactionsList.stream().filter(t->t.getYear()==2011)
                .sorted((ob1,ob2)->ob1.getValue().compareTo(ob2.getValue()))
                .forEach(e-> System.out.println(e));

        System.out.println("----------\nAnswer 9");
        System.out.println("Unique cities from where there is only one trader belong");

        Map<String,List<Trader>> ansFor9=traderList.stream()
                .collect(Collectors.groupingBy(e->e.getCity()));

        Set<String> setfor9 = ansFor9.keySet();
        setfor9.stream().filter(s->ansFor9.get(s).size()==1)
                .forEach(c-> System.out.println(c));

        System.out.println("----------\nAnswer10\nTraders from Pune sorted by their name");
        traderList.stream().filter(t->t.getCity().equalsIgnoreCase("pune"))
                .sorted((ob1,ob2)->ob1.getName().compareTo(ob2.getName()))
                .forEach(e-> System.out.println(e));

        System.out.println("-----------\nAnswer11\nTraders sorted alphabetically");
        traderList.stream().sorted((ob1,ob2)->ob1.getName().compareTo(ob2.getName()))
                .forEach(e-> System.out.println(e.getName()));

        System.out.println("------------\nAnswer12");
        Stream<Trader> s =  traderList.stream().filter(t->t.getCity()
                .equalsIgnoreCase("indore"));
        long count = s.count();
        if(count!=0)
            System.out.println("Yes there are some traders based on Indore");
        else
            System.out.println("No there is no trader based on Indore");

        System.out.println("-----------\nAnswer13\nTransaction value for the traders based in Delhi");
        transactionsList.stream().filter(t->t.getTrader().getCity().equalsIgnoreCase("delhi"))
                .forEach(e-> System.out.println(e.getValue()));

        System.out.println("---------\nAnswer14\nHighest value for Transaction is");
        Integer maxTransactionValue =
        transactionsList.stream().max((object1,object2)->object1.getValue().compareTo(object2.getValue()))
                .get().getValue();

        System.out.println(maxTransactionValue);

        System.out.println("---------\nAnswer15\nSmallest value for Transaction is");
        Integer minTransactionValue =
                transactionsList.stream().min((object1,object2)->object1.getValue().compareTo(object2.getValue()))
                        .get().getValue();

        System.out.println(minTransactionValue);

    }
}
