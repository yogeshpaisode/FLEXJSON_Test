package hib;
// Generated Jun 4, 2016 9:15:25 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MainCategory generated by hbm2java
 */
public class MainCategory  implements java.io.Serializable {


     private Integer mainCategoryId;
     private String name;
     private Set<FirstSubcategory> firstSubcategories = new HashSet<FirstSubcategory>(0);

    public MainCategory() {
    }

	
    public MainCategory(String name) {
        this.name = name;
    }
    public MainCategory(String name, Set<FirstSubcategory> firstSubcategories) {
       this.name = name;
       this.firstSubcategories = firstSubcategories;
    }
   
    public Integer getMainCategoryId() {
        return this.mainCategoryId;
    }
    
    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<FirstSubcategory> getFirstSubcategories() {
        return this.firstSubcategories;
    }
    
    public void setFirstSubcategories(Set<FirstSubcategory> firstSubcategories) {
        this.firstSubcategories = firstSubcategories;
    }




}


