package groupe203.practical1.association.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address(1L, "sds","as","asdd","das");
        Address address2 = new Address(2L, "sdfg","as","asdd","das");
        Address address3 = new Address(2L, "sddd","as","asdd","das");

        List<Address> addressList = new ArrayList<>();

        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);

        Client client = new Client(1L, "Vasya","Pypkin", 24, "sadsa",addressList);


        System.out.println(client);
    }
}
