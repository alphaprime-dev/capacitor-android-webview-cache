import { registerPlugin } from '@capacitor/core';

import type { WebviewCachePlugin } from './definitions';

const WebviewCache = registerPlugin<WebviewCachePlugin>('WebviewCache', {
  web: () => import('./web').then((m) => new m.WebviewCacheWeb()),
});

export * from './definitions';
export { WebviewCache };
