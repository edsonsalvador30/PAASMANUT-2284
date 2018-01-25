package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoServidor {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco_Servidor
	public static Var Executar_servidor() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.valueOf("Bloco Servidor Criado\n");
			}
		}.call();
	}

}
