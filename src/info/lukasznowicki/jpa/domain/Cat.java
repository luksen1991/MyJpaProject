package info.lukasznowicki.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Cat")
public class Cat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CatId")
	private long Id;

	@Column(name = "Name")
	private String name;

	@OneToOne(mappedBy="cat")
	@JoinColumn(name = "OwnerId")
	private Owner owner;

	public long getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
