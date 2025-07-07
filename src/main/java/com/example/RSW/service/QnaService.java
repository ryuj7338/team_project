package com.example.RSW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RSW.repository.QnaRepository;
import com.example.RSW.vo.Qna;

@Service
public class QnaService {

	@Autowired
	private QnaRepository QnaRepository;

	public Qna findMostSimilarFaq(String inputText) {
		
		return QnaRepository.findBySimilarQuestion(inputText);
	}
}

