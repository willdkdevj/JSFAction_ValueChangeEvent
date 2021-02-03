package br.com.supernovatech.business;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import br.com.supernovatech.model.Continente;
import br.com.supernovatech.model.Estado;
import br.com.supernovatech.model.Pais;
import br.com.supernovatech.model.Regiao;

public class ContinenteProvider {

	private static final Map<String, Continente> continentesMap = new TreeMap<>();
	private static final Map<String, Pais> paisMap = new TreeMap<>();
	private static final Map<String, Regiao> regioesMap = new TreeMap<>();
	
	static {
		
		Continente continente = null;
		Pais pais = null;
		Regiao regiao = null;
		Estado estado = null;
		
		continente = new Continente("AN", "América do Norte");
		continentesMap.put("AN", continente);
		
		
		
		pais = new Pais("EUA", "Estados Unidos da Améria", continente);
		paisMap.put("AN", pais);		
		continente.getPaises().add(pais);
							
		pais = new Pais("CAN", "Canadá", continente);
		paisMap.put("AN", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("MEX", "Mexico", continente);
		paisMap.put("MEX", pais);
		continente.getPaises().add(pais);
		
		regiao = new Regiao("SUR", "Sur", pais);
		regioesMap.put("SUR", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("GUA", "Guadalajara", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("CIM", "Cidade do México", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("TOL", "Toluca", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("NOR", "Norte", pais);
		regioesMap.put("NOR", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("MON", "Monterrei", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("JUA", "Juárez", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("TIJ", "Tijuana", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("EST", "Este", pais);
		regioesMap.put("EST", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("CHI", "Chihuahua", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("QUE", "Querétaro", regiao);
		regiao.getEstados().add(estado);
		
		continente = new Continente("AS", "América do Sul");
		continentesMap.put("AS", continente);
		
		
		pais = new Pais("BRA", "Brasil", continente);
		paisMap.put("BRA", pais);
		continente.getPaises().add(pais);
		
		regiao = new Regiao("S" , "Sul", pais);
		regioesMap.put("S", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("RS", "Rio Grande do Sul", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("SC","Santa Catarina", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("PR", "Paraná", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao ("SE", "Sudeste", pais);
		regioesMap.put("SE", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("SP", "São Paulo", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("RJ", "Rio de Janeiro", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("MG", "Minas Gerais", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("ES", "Espírito Santo", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("NE", "Nordeste", pais);
		regioesMap.put("NE", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("BA", "Bahia", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("SE", "Sergipe", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("AL", "Alagoas", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("PE", "Pernambuco", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("PB", "Paraíba", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("RN", "Rio Grande do Norte", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("CE", "Ceará", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("PI", "Piauí", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("MA", "Maranhão", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("N", "Norte", pais);
		regioesMap.put("N", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("AM","Amazonas", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("PA", "Pará", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("AC", "Acre", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("RO", "Rondônia", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("RR", "Roraíma", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("TO", "Tocantis", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("AP", "Amapá", regiao);
	    regiao.getEstados().add(estado);
	    
	    regiao = new Regiao("CO", "Cetro-Oeste", pais);
	    regioesMap.put("CO", regiao);
	    pais.getRegioes().add(regiao);
	    
	    estado = new Estado("MS", "Mato Grosso do Sul", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("MT", "Mato Grosso", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("GO", "Goías", regiao);
	    regiao.getEstados().add(estado);
	    estado = new Estado("DF", "Distrito Federal", regiao);
	    regiao.getEstados().add(estado);
		
		
		pais = new Pais("URU", "Uruguai", continente);
		paisMap.put("AS", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("ARG", "Argentina", continente);
		paisMap.put("AS", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("CHI", "Chile", continente);
		paisMap.put("AS", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("PER", "Peru", continente);
		paisMap.put("AS", pais);
		continente.getPaises().add(pais);
		
		continente = new Continente("AFR", "Africa");
		continentesMap.put("AFR", continente);
		
		pais = new Pais("CON", "Congo", continente);
		paisMap.put("AFR", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("ANG", "Angola", continente);
		paisMap.put("AFR", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("MAR", "Marrocos", continente);
		paisMap.put("AFR", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("QUE", "Quênia", continente);
		paisMap.put("AFR", pais);
		continente.getPaises().add(pais);
				
		continente = new Continente("ASI", "Ásia");
		continentesMap.put("ASI", continente);
		
		pais = new Pais("CHI", "China", continente);
		paisMap.put("CHI", pais);
		continente.getPaises().add(pais);
		
		regiao = new Regiao("G", "Guangdong", pais);
		regioesMap.put("G", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("DON", "Dongguan", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("CAN", "Cantão", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("SHE", "Shenzhen", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("FOS", "Foshan", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("X", "Xangai", pais);
		regioesMap.put("X", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("XAN", "Xangai", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("P", "Pequim", pais);
		regioesMap.put("P", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("PEQ", "Pequim", regiao);
		regiao.getEstados().add(estado);
		estado = new Estado("HNK", "Hong Kong", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new Regiao("H", "Hubei", pais);
		regioesMap.put("H", regiao);
		pais.getRegioes().add(regiao);
		
		estado = new Estado("WUH", "Wuhan", regiao);
		regiao.getEstados().add(estado);
		
		
		pais = new Pais("JAP", "Japão", continente);
		paisMap.put("ASI", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("RUS", "Rússia", continente);
		paisMap.put("ASI", pais);
		continente.getPaises().add(pais);
		
		pais = new Pais("IND", "Índia", continente);
		paisMap.put("ASI", pais);
		continente.getPaises().add(pais);
				
	}
	
	public static Collection<Continente> getContinentes(){
		return continentesMap.values();
	}
	
	public static Collection<Pais> getPaises(String siglaContinente){
		Continente continente = continentesMap.get(siglaContinente);
		
		if (continente == null)
			return Collections.emptyList();
		return continente.getPaises();
	}
	
	public static Collection<Regiao> getRegioes(String siglaPaises) {
		Pais pais = paisMap.get(siglaPaises);
		
		if(pais == null)
			return Collections.emptyList();
		return pais.getRegioes();
	}
	
	public static Collection<Estado> getEstados(String siglaRegiao) {
		Regiao regiao = regioesMap.get(siglaRegiao);
		
		if (regiao == null)
			return Collections.emptyList();
		
		return regiao.getEstados();
	}
}
