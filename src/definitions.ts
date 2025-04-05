export interface WebviewCachePlugin {
  clearCache(): Promise<void>;
}