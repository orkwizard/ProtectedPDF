package sunset.it.tools.api.interfaces.document;

import sunset.it.tools.api.objects.ResponseContext;
import sunset.it.tools.api.objects.ResponseResponse;

public interface Login {
	public String loginChallenge(String client_nonce);
	public ResponseResponse loginResponse(ResponseContext context);

}
