import { WebPlugin } from '@capacitor/core';

import type { WebviewCachePlugin } from './definitions';

export class WebviewCacheWeb extends WebPlugin implements WebviewCachePlugin {
  async clearCache(): Promise<void> {
    throw this.unimplemented('Not implemented on web.');
  }
}
