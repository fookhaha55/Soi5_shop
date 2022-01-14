package nvc.bcit.soi5shopstart.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter @Setter @NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int unitInStock;
    
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;
}









    // public int getIs() {
    //     return id;
    
//     public void setIs(int is) {
//         this.id = is;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public double getPricr() {
//         return price;
//     }
//     public void setPricr(double pricr) {
//         this.price = pricr;
//     }
//     public int getUnitInStock() {
//         return unitInStock;
//     }
//     public void setUnitInStock(int unitInStock) {
//         this.unitInStock = unitInStock;
//     }



// }

