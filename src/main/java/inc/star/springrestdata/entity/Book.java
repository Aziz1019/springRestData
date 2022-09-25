package inc.star.springrestdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

// To make unique two columns

//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"book_name", "price"}))

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "book_name")
    private String name;
    private String price;
    private Integer count;
}
