package sistema.entidade.abstracts;

import java.io.Serializable;

public abstract class EntidadeBase implements Serializable{
	
	private static final long serialVersionUID = 879172747659858445L;

	public abstract Long getId();

	public final boolean isPersisted() {
		return getId() != null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		EntidadeBase other = (EntidadeBase) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
}
