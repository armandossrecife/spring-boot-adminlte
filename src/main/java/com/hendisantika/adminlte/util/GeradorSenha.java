package com.hendisantika.adminlte.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenha {
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  
	
	/**
	 * Criptografa senha baseeada no padrão BCryptPasswordEncoder
	 * @param valor senha original
	 * @return senha criptografada
	 */
	public String criptografa(String valor){
		return encoder.encode(valor);
	}
	
	/**
	 * Compara a senha criptografada do banco com a senha passada
	 * @param password senha passada
	 * @param senhaCriptografada senha cripgrafada guardada no banco
	 * @return
	 */
	public boolean comparaSenhas(String password, String senhaCriptografada){
		return encoder.matches(password, senhaCriptografada);
	}

}