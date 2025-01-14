package br.com.erudio.integrationtests.vo.pagedmodels;

import java.util.List;

import br.com.erudio.integrationtests.vo.PersonVO;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PagedModelPerson {

	@XmlElement(name = "content")
	private List<PersonVO> content;

	public PagedModelPerson() {}

	public List<PersonVO> getContent() {
		return content;
	}

	public void setContent(List<PersonVO> content) {
		this.content = content;
	}
}
