package com.infosys.matrimony.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "message")
public class Message {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String location;
    private String date;
    private String time;

	@ManyToOne // Many messages can be associated with one registration
	@JoinColumn(name="rid")
	private Registration registration;

    // @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "message_id")
    // private Long id;

    // @Column(name = "from_username")
    // private String fromUsername;
    
    // @Column(name = "to_username")
    // private String toUsername;

    // @Column(name = "message")
    // private String message;

	// public Long getId() {
	// 	return id;
	// }

	// public void setId(Long id) {
	// 	this.id = id;
	// }

	// public String getFromUsername() {
	// 	return fromUsername;
	// }

	// public void setFromUsername(String fromUsername) {
	// 	this.fromUsername = fromUsername;
	// }

	// public String getToUsername() {
	// 	return toUsername;
	// }

	// public void setToUsername(String toUsername) {
	// 	this.toUsername = toUsername;
	// }

	// public String getMessage() {
	// 	return message;
	// }

	// public void setMessage(String message) {
	// 	this.message = message;
	// }
    
    
}
