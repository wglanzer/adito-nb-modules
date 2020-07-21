package de.adito.nbm.runconfig.api;

import de.adito.aditoweb.nbm.nbide.nbaditointerface.tunnel.ITunnelConfigProvider;
import io.reactivex.rxjava3.core.Observable;

import java.util.Map;

/**
 * Provides access to information about a system
 *
 * @author m.kaspera, 10.07.2020
 */
public interface ISystemInfo extends ITunnelConfigProvider
{

  /**
   *
   *
   * @return true if the system is declared as productive system
   */
  boolean isProductive();

  /**
   * get an Observable of the cloud property of a system
   *
   * @return Observable
   */
  Observable<Boolean> isCloud();

  /**
   * Get a map with parameter settings
   *
   * @return Map
   */
  Map<String, String> getParameters();

}
