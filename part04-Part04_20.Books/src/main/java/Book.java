/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duncan
 */
public class Book {
    private String instanceTitle;
    private int instancePages;
    private int instanceYear;
    
    public Book(String paramTitle, int paramPages, int paramYear){
        this.instanceTitle = paramTitle;
        this.instancePages = paramPages;
        this.instanceYear = paramYear;
    }

    public String getEverything(){
        return getInstanceTitle() + ", " + getInstancePages() + " pages, " + getInstanceYear();
    }
    
    public String getInstanceTitle() {
        return instanceTitle;
    }

    public void setInstanceTitle(String instanceTitle) {
        this.instanceTitle = instanceTitle;
    }

    public int getInstancePages() {
        return instancePages;
    }

    public void setInstancePages(int instancePages) {
        this.instancePages = instancePages;
    }

    public int getInstanceYear() {
        return instanceYear;
    }

    public void setInstanceYear(int instanceYear) {
        this.instanceYear = instanceYear;
    }
    
    
    
}
