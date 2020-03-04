

import java.util.List;
import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class RegistroINE {

	private ObjectContainer db = null;

	private void abrirRegistro() {
		db = Db4oEmbedded.openFile("registroClientes");
	}

	private void cerrarRegistro() {
		db.close();
	}

	void insertarRegistro(Persona p) {
		abrirRegistro();
		db.store(p);
		cerrarRegistro();
	}

	public List<Persona> seleccionarPersonas() {
		abrirRegistro();
		ObjectSet<Object> listaPersonas = db.queryByExample(Persona.class);
		List<Persona> lp = new ArrayList<>();

		for (Object listaPersonas1 : listaPersonas) {
			lp.add((Persona) listaPersonas1);
		}

		cerrarRegistro();

		return lp;
	}

	public Persona seleccionarPersona(Persona p) {
		abrirRegistro();
		ObjectSet<Object> resultado = db.queryByExample(p);
		Persona persona = (Persona) resultado.next();
		cerrarRegistro();
		return persona;
	}


}
