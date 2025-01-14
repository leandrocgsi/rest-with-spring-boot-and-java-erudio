package br.com.erudio.vo.response;

import java.io.Serializable;
import java.util.List;

public class ChatGptResponse implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private List<Choice> choices;

    public ChatGptResponse() {}

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((choices == null) ? 0 : choices.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ChatGptResponse other = (ChatGptResponse) obj;
        if (choices == null) {
            if (other.choices != null)
                return false;
        } else if (!choices.equals(other.choices))
            return false;
        return true;
    }
}