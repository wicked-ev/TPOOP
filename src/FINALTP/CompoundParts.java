package FINALTP;

import java.util.ArrayList;

public class CompoundParts extends Part{
    private String Name;

    private  int assemabletime;

    private ArrayList<Part> listofparts = new ArrayList<Part>();

    public void add(Part newpart){
        listofparts.add(newpart);
        this.assemabletime +=newpart.fab_time();
    }
    public CompoundParts(String name){
        this.Name = name;
        this.assemabletime = 0;
    }
    public void displayParts(){
        for (int i = 0; i < this.listofparts.size(); i++) {
            System.out.println("part Name"+this.listofparts.get(i).getName() +" Manufacture time:"+ this.listofparts.get(i).fab_time());
        }
    }

    public void setName(String name) {
        Name = name;
    }


    public String getName() {
        return this.Name;
    }


    @Override
    public int fab_time() {
        return assemabletime;
    }
}
