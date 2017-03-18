package br.tiagohm.rmi;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Criada para facilitar a passagem de objeto entre o cliente e o servidor.
 *
 * @author Tiago Henrique de Melo.
 */
public interface SerializableRemote extends Remote, Serializable
{
}
