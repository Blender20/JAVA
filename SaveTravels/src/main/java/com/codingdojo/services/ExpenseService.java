package com.codingdojo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Expense;
import com.codingdojo.repositories.ExpenseRepository;

@Service
public class ExpenseService 
{
	@Autowired
	private ExpenseRepository expenseRepository;
	
//	insert into expense() values();
	public void create(Expense expense)
	{
		expenseRepository.save(expense);
	}

//	update table expense(sfssf,sfsfs,sfsffd) values(sdfs,sfsfd,sfssdf) where expense.id=expense.getId()
	public void update(Expense expense)
	{
		expenseRepository.save(expense);
	}
	
//	select * from expense;
	public ArrayList<Expense> findAll()
	{
		return (ArrayList<Expense>) expenseRepository.findAll();
	}

//	select * from movie where movie.id=?;
	public Expense findOne(Long id)
	{
		Optional<Expense> expense=expenseRepository.findById(id);
		return expense.isPresent()?expense.get():null;
	}
	
	public void deleteOne(Long id)
	{
		expenseRepository.deleteById(id);
	}
};
