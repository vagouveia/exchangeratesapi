package br.com.vitor.exchangeratesapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "currency")
public class Currency implements Serializable {

	
	private static final long serialVersionUID = 3037686834213319994L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false, name = "origin_currency")
	private String originCurrency;
	@Column(nullable = false, name = "source_value")
	private Double sourceValue;
	@Column(nullable = false, name = "destination_currency")
	private String destinationCurrency;
	@Column(nullable = false, name = "destination_value")
	private Double destinationValue;
	@Column(nullable = false, name = "conversion_rate_used")
	private String conversionRateUsed;
	@Column(nullable = false, name = "date")
	private LocalDate date;

}
