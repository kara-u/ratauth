package ru.ratauth.providers.registrations;

import ru.ratauth.providers.registrations.dto.RegInput;
import ru.ratauth.providers.registrations.dto.RegResult;
import rx.Observable;

/**
 * Interface of registration provider
 * @author mgorelikov
 * @since 28/01/16
 */
public interface RegistrationProvider<T extends RegResult> {
  /**
   * Register user by some identifier entities like login or other unique identifier, set of fields depends on identity provider
   * @param input input fields container
   * @return map of user userInfo provided by concrete identity provider or Observable.empty
   * @throws ru.ratauth.exception.AuthorizationException by Observable.error
   */
  Observable<T> register(RegInput input);

  int getProvidedAssuranceLevel();
}
