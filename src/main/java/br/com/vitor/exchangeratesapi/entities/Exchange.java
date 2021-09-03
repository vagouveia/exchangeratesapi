package br.com.vitor.exchangeratesapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exchange {

	public boolean success;
	public int timestamp;
	public String base;
	public String date;
	public Rates rates;

}
