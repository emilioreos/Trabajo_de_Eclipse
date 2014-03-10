package kanban;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea=new Tarea();
		tarea.setDescripcion("Completar el programa");
		LibretaDeTareas libreta=new LibretaDeTareas();
		tarea.setEstado(Estado.TO_DO);
		if(libreta.agragar(tarea)){
			System.out.println("listo "+tarea.getDescripcion());
		}
	}

}
