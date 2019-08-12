package day14;

interface Command {
	public void exec();
	default public void check() {
		System.out.println("Command check() 함수");
	}
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("Delete 수행");
	}
	@Override
	public void check() {
		System.out.println("DeleteCommand check() 함수");
	}
}

class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Insert 수행");
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Update 수행");
	}
}

class ListCommand implements Command {
	@Override
	public void exec() {
		System.out.println("List 수행");
	}
}

