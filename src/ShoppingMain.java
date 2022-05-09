// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("CS Gift Catalog");
        //list.add(new Item("Monday 13 16:00", 200, 10, 19.99));
        //list.add(new Item("silly string", 3.50, 10, 14.95));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 180," yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 90," yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 320," yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 230," yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 400," yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 ", 35," yes"));
        //list.add(new Item("'Java Rules!' button", 0.99, 10, 5.0));
        //list.add(new Item("'Java Rules!' bumper sticker", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
