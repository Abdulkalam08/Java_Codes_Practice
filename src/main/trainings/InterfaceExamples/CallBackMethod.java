package main.trainings.InterfaceExamples;

interface IMember{
    void callBack();
}

class Store{
    IMember [] iMember = new IMember[100];
    int count;

    void register(IMember mem){
        iMember[count++] = mem;
    }
    void inviteForSale(){
        for(int i=0;i<count;i++){
            iMember[i].callBack();
        }
    }
}

class Customer implements IMember{
    String name;
    Customer(String name){
        this.name=name;
    }

    @Override
    public void callBack() {
        System.out.println("I will visit the Store : "+ name);
    }
}

public class CallBackMethod {
    public static void main(String[] args) {
        Customer customer = new Customer("Smith");
        Store store = new Store();
        store.register(customer);
        store.inviteForSale();
    }
}
