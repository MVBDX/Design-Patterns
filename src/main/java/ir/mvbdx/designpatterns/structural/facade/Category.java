package ir.mvbdx.designpatterns.structural.facade;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@SQLDelete(sql = "UPDATE category SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private Set<Transaction> transactions;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parentCategory;
    @OneToMany(mappedBy = "parentCategory")
    private Set<Category> subordinates = new HashSet<>();
}
