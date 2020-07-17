package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgers implements McBurgers {

    private List<McBurger> burgers = new ArrayList<>();

    @Override
    public McBurger findById(long id){
//        get the McBurger at the index 'id'
        return burgers.get((int)id - 1);
    }

    @Override
    public long createBurger(McBurger burger){
        //determined what the ID will be of new burger;
       burger.setId(burgers.size() + 1);

        //add this burger to the list
       burgers.add(burger);

       //we need to return
       return burger.getId();


    }

}
